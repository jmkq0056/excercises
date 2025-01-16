package five;

import java.time.LocalDate;

public interface Perishable extends FridgeItem {
    LocalDate getExpirationDate();
}
