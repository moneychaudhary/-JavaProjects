import java.util.LinkedList;
import java.util.List;

public class FriendService
{

    public static boolean internetAvailable =true;
    public static boolean userIdValid =true;
    public static List<String>  fetchFriendList(int userId) throws  UserIdInvalidException,InternetUnavailableException
    {

        if(!internetAvailable)
        {
            throw new InternetUnavailableException();
        }
        if(!userIdValid)
        {
            throw new UserIdInvalidException("User ID should be negative");
        }

        List<String> friendsList = new LinkedList<>();
        friendsList.add("Rohan");
        friendsList.add("kamal");
        friendsList.add("Robin");
        friendsList.add("Karnik");

        return friendsList;

    }
}
