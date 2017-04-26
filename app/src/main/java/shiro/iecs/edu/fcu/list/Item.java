package shiro.iecs.edu.fcu.list;

public class Item {
    private String title;
    private String details;

    public Item(String title,String details) {
        this.title = title;
        this.details = details;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getDetails(){
        return this.details;
    }
    public void setDetails(String details){
        this.details = details;
    }
}
