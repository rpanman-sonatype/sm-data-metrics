package sm.data.metrics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

@DisplayName("The application should")
class AppTest {
    @DisplayName("return the correct greeting")
    @Test void appHasAGreeting() {
        assertThat(new App().getGreeting()).isNotNull().isEqualTo("Hello World!");
    }
}
