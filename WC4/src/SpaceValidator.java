public class SpaceValidator implements Validator<String>
{
    @Override
    public boolean isValid(String subjectToValidate)
    {
        return subjectToValidate.isEmpty();
    }
}
