import java.util.HashSet;

public class PasswordValidator extends ValidatorGroup<String> implements Validator<String>
{
    public PasswordValidator(Validator<String> validator)
    {
        super(validator);
    }

    @Override
    public boolean isValid(String user)
    {
        return false;
    }
}
