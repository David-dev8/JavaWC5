import java.util.HashSet;

public abstract class ValidatorGroup<Type> implements Validator<Type>
{
    private final HashSet<Validator<Type>> validators;

    public ValidatorGroup(Validator<Type> validator)
    {
        this.validators = new HashSet<>();
        this.validators.add(validator);
    }

    public void addValidator(Validator<Type> validator)
    {
        this.validators.add(validator);
    }

    @Override
    public boolean isValid(Type subjectToValidate)
    {
        for(Validator<Type> validator : this.validators)
        {
            if(!validator.isValid(subjectToValidate))
            {
                return false;
            }
        }
        return true;
    }
}
