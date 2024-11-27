package Ecommerce.model.product.entities.enums;

import java.util.Locale;

public enum Color {
    RED,
    WHITE,
    BLACK,
    MARROW;

    @Override
    public String toString(){
        return name().toLowerCase(Locale.ROOT);
    }
}
