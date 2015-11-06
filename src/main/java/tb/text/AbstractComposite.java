package tb.text;

import java.util.List;

public abstract class AbstractComposite<Z extends Component> implements Composite<Z> {
    List<Component> components;

    public void add(Z component) {
        components.add(component);
    }

    public void remove(Z component) {
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public String toSourceString() {
        StringBuilder builder = new StringBuilder();
        for (Component component : components) builder.append(component.toSourceString());
        return builder.toString();
    }
}
