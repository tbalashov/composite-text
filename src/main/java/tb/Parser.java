package tb;

import tb.text.Component;
import tb.text.Composite;
import tb.text.Symbol;
import tb.text.Text;

import java.util.Map;

public class Parser {


    Map<Class<? extends Composite>, String> patterns;

    Map<Class<? extends Composite>, Class<? extends Component>> componentMap;

    Text parse(String sourceString) {
        return parse(sourceString, Text.class);
    }


    <T extends Composite> T parse(String sourceString, Class<T> compositeClass) {

        T t;
        try {
            t = compositeClass.newInstance();
            Class componentClass = componentMap.get(compositeClass);
            String[] strings = sourceString.split(" ");

            for (String string : strings) {
                if (componentClass == Symbol.class) {
                    Symbol s = new Symbol(string);
                    t.add(s);
                } else {
                    Component c = parse(string, componentClass);
                    t.add(c);
                }
            }
            return t;
        } catch (InstantiationException | IllegalAccessException ignored) {
            throw new RuntimeException();
        }
    }

    public void configure() {

    }
}
