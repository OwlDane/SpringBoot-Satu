package belajar_spring.scope;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.lang.Nullable;

public class DoubletonScope implements Scope {

    private List<Object> objects = new ArrayList<>(2);

    private Long counter = -1L;

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        // TODO Auto-generated method stub
        counter++;

        if(objects.size()== 2){
            int index = (int) (counter % 2);
            return objects.get(index);
        } else {
            Object object = objectFactory.getObject();
            objects.add(object);
            return object;
        }
    }

    @Override
    @Nullable
    public String getConversationId() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        // TODO Auto-generated method stub
        
    }

    @Override
    @Nullable
    public Object remove(String name) {
        if (!objects.isEmpty()) {
            return objects.remove(0);
        }
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    @Nullable
    public Object resolveContextualObject(String key) {
        // TODO Auto-generated method stub
        return null;
    }

}
