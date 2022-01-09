package sun.yang.test.pojo;

import lombok.Data;
import org.springframework.beans.factory.FactoryBean;

@Data
public class UserFatoryBean implements FactoryBean {
    private String name;

    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
