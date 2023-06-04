import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
        @Test
        public void randomStation() {
        Radio stat = new Radio();

        stat.setCurrentStation(5);

        int expected = 5;
        int actual = stat.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void maxStation() {
                Radio stat = new Radio();

                stat.setCurrentStation(10);

                int expected = 0;
                int actual = stat.getCurrentStation();

                Assertions.assertEquals(expected, actual);
        }

        @Test
        public void minStation() {
                Radio stat = new Radio();

                stat.setCurrentStation(-1);

                int expected = 9;
                int actual = stat.getCurrentStation();

                Assertions.assertEquals(expected, actual);
        }

        @Test
        public void minVolume() {
                Radio vol = new Radio();

                vol.setCurrentVolume(-1);

                int expected = 0;
                int actual = vol.getCurrentVolume();

                Assertions.assertEquals(expected, actual);
        }

        @Test
        public void maxVolume() {
                Radio vol = new Radio();

                vol.setCurrentVolume(101);

                int expected = 100;
                int actual = vol.getCurrentVolume();

                Assertions.assertEquals(expected, actual);
        }
}


