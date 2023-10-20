package work.icql.icm.product.b.server.designpattern.creational.factory.abstractfactory.factory;

import work.icql.java.designpattern.creational.factory.abstractfactory.IObject;
import work.icql.java.designpattern.creational.factory.abstractfactory.ObjectFactory;
import work.icql.java.designpattern.creational.factory.abstractfactory.object.ObjectA1;
import work.icql.java.designpattern.creational.factory.abstractfactory.object.ObjectA2;

public class ObjectAFactory implements ObjectFactory {
    @Override
    public IObject createObject1(String type) {
        //复杂的创建逻辑
        return new ObjectA1();
    }

    @Override
    public IObject createObject2(String type) {
        return new ObjectA2();
    }
}
