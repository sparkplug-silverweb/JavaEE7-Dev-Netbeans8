import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author lserd
 */
@Named
@RequestScoped
public class RegistrationBean {
    private String salutation;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    
    
    
}
