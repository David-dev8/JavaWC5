public class UppercaseValidator implements Validator<String>
{
    @Override
    public boolean isValid(String subjectToValidate)
    {
        return subjectToValidate.matches("[A-Z]]");
    }
}
