public class UniquenessValidator implements Validator<String>
{
    @Override
    public boolean isValid(String subjectToValidate)
    {
        for(User user : Application.getUsers())
        {
            if(user.getUsername().contentEquals(subjectToValidate)) {
                return false;
            }
        }
        return true;
    }
}
