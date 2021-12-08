import java.util.ArrayList;
import java.util.List;

public class Application
{
    private final List<User> users;

    public Application()
    {
        this.users = new ArrayList<>();
    }

    public List<User> getUsers()
    {
        return this.users;
    }

    public void registerUser(User user, Validator validator)
    {
        if(validator.isValid(user))
        {
            this.users.add(user);
        }
    }
}
