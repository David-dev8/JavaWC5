public class MinimumNumberValidator implements Validator<Integer>
{
    private final int minimum;

    public MinimumNumberValidator(int minimum)
    {
        this.minimum = minimum;
    }

    @Override
    public boolean isValid(Integer value)
    {
        return value >= this.minimum;
    }
}
