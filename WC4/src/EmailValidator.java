public class EmailValidator implements Validator<String>
{
    @Override
    public boolean isValid(String value)
    {
        return value.matches("^(?!.*[_.\\-]{2,}.*)[a-z\\d]([a-z\\d_.\\-]){0,63}@(?=.*\\.)[a-z\\d\\-.]{0,253}[a-z]{2}$");
    }
}
