import java.util.ArrayList;
import java.util.List;

public class Application
{
    private static final List<User> users = new ArrayList<>();

    public static List<User> getUsers()
    {
        return Application.users;
    }

    public static void registerUser(User user, Validator validator)
    {
        if(validator.isValid(user))
        {
            Application.users.add(user);
        }
    }
}
