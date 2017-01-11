package eventbus.view.menu;

public class MenuBean {
    public MenuBean() {
        super();
        color="green";
    }
    
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
