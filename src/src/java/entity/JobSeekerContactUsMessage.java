
package entity;

/**
 *
 * @author Murat
 */
public class JobSeekerContactUsMessage {
    
    private JobSeeker from;
    
    
    public JobSeekerContactUsMessage() {
    }
    
    public JobSeekerContactUsMessage(JobSeeker from) {
        this.from = from;
    }

    public JobSeeker getFrom() {
        return from;
    }

    public void setFrom(JobSeeker from) {
        this.from = from;
    }

    
    
    
    
}
