import java.util.Vector;
public class UserArchive {
 private Vector<User> users = new Vector<User>();

 public User getUser(String name) {
  for (User u : users) {
   if (u.getName().equals(name)) {
    return u;
   }
  }
  return null;
 }

 public void setUser(User user) {
  users.add(user);
 }

 //proverqva dali ima takuv
 public int availableUser(String name) {
  for (User u : users) {
   if (u.getName().equals(name)) {
    return 1;
   }
  }
  return 0;
 }

 //proverqva user i parola
 public int correctUser(String name, String password) {
  for (User u : users) {
   if (u.getName().equals(name)) {
    if (u.getPassword().hashCode() == password.hashCode()) {
     return 1;
    } else System.out.println("Incorrect password");
   }
  }
  System.out.println("No such user");
  return 0;
 }
}
