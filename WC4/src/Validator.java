public interface Validator<Type>
{
    boolean isValid(Type subjectToValidate);
}