package expert006;

import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.Resource;

public class Car {
    @Autowired
    // @Resource
    Tire tire;
//    public Tire getTire(){
//        return tire;
//    }

    //public void setTire(Tire tire){
    //    this.tire = tire;
    //}

    public String getTireBrand(){
        return "장착된 타이어: " + tire.getBrand();
    }
}
