package racinggame.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    @DisplayName("Mingyu가 이김")
    void race_MingyuWinPobi(){
        Car A = new Car("Mingyu");
        Car B = new Car("Pobi");

        A.forward();

        assertThat(A.race(B)).isEqualTo("Mingyu");
    }

    @Test
    @DisplayName("Mingyu와 Pobi 비김")
    void race_draw(){
        Car A = new Car("Mingyu");
        Car B = new Car("Pobi");

        A.forward();
        B.forward();

        assertThat(A.race(B)).isEqualTo("Mingyu,Pobi");
    }
}
