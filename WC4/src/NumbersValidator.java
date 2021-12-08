public class NumbersValidator implements Validator<String>
{
    @Override
    public boolean isValid(String subjectToValidate)
    {
        return subjectToValidate.matches("\\d");
    }
}
