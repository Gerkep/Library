package model;

import exceptions.PublicationAlreadyExistException;
import exceptions.UserAlreadyExistException;

import java.util.*;

public class Library{

    private HashMap <String, Publication> publications = new HashMap<>();
    private HashMap <String, LibraryUser> users = new HashMap<>();

    public Optional<Publication> findPublicationByTitle(String title) {
        return Optional.ofNullable(publications.get(title));
    }
    public Collection<Publication> getSortedPublications(Comparator<Publication> comparator){
        List<Publication> list = new ArrayList<>(this.publications.values());
            list.sort(comparator);
        return list;
    }

    public Map <String, Publication> getPublications(){
        return publications;
    }
    public Map <String , LibraryUser> getUsers(){ return users; }

    public Collection<LibraryUser> getSortedUsers(Comparator<LibraryUser> comparator){
        List<LibraryUser> list = new ArrayList<>(users.values());
        list.sort(comparator);
        return list;
    }

    public void addUser(LibraryUser user){
        if (users.containsKey(user.getPesel()))
        throw new UserAlreadyExistException("Użytkownik o podanym peselu już istnieje" + user.getPesel());
users.put(user.getPesel(), user);
    }
    public void  addPublication(Publication publication){
        if (publications.containsKey(publication.getTitle()))
            throw new PublicationAlreadyExistException("Książka o podanym tytule już istnieje" + publication.getTitle());
        publications.put(publication.getTitle(), publication);
    }
    public boolean removePublication(Publication publication){
        if (publications.containsValue(publication)){
            publications.remove(publication.getTitle());
            return true;
        }else {
            return false;
        }

    }
}

