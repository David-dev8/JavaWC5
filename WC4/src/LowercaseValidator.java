public class LowercaseValidator implements Validator<String>
{
    @Override
    public boolean isValid(String subjectToValidate)
    {
        return subjectToValidate.matches("[a-z]]");
    }
}
