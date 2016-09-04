import java.util.List;

public class Demo {

    public static void main(String[] args) throws Exception {

        try {
            List<String> allFriends = FriendService.fetchFriendList(10);
            System.out.println("2nd line of try");
            System.out.println(allFriends);
        }
        catch (InternetUnavailableException e)
        {
            System.out.println("Internet Not working ,check your Internet Settings");
            throw e;
            //write code to handle situation when error due to Internet unavailabilty
        }
        catch (UserIdInvalidException e){
            System.out.println(e.getMessage());
            //write code to handle situation when error due to invalid userid
        }

        finally {

        }


    }
}

