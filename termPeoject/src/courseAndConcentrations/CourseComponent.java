package courseAndConcentrations;
//template pattern for format function
import java.util.List;

public abstract class CourseComponent {
    protected String id;
    protected String name;
    protected String description;

    public CourseComponent(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public String format() {
        StringBuilder sb = new StringBuilder();
        sb.append("<h2>" + getId() + getName()+ "</h2>\n");
        sb.append("<p>" + getDescription() + "</p>\n");
        sb.append(getContent());
        return sb.toString();
    }
    // The template method
    public final String getContent() {
        StringBuilder sb = new StringBuilder();
        sb.append("<h3>" + getSectionTitle() + "</h3>\n");
        sb.append("<ul>\n");
        for (String item : getItems()) {
            sb.append("<li>" + item + "</li>\n");
        }
        sb.append("</ul>\n");
        return sb.toString();
    }

    // The abstract methods to be implemented by subclasses
     abstract String getTitle();
     abstract String getSectionTitle();
     abstract List<String> getItems();
}
