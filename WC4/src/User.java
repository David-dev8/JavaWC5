import java.time.LocalDate;
import java.time.Period;

public class User
{
    private String username;
    private String password;
    private String email;
    private LocalDate dateOfBirth;

    public User(String username, String password, String email, String dateOfBirth)
    {
        this.username = username;
        this.password = password;
        this.email = email;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }

    public String getUsername()
    {
        return this.username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return this.password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public LocalDate getDateOfBirth()
    {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }

    public int getAge()
    {
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }
}
