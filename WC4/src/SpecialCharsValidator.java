public class SpecialCharsValidator implements Validator<String>
{
    @Override
    public boolean isValid(String subjectToValidate)
    {
        return subjectToValidate.matches("\\W");
    }
}
