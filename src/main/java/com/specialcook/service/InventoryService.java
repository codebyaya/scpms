
package com.specialcook.service;

import com.specialcook.model.Ingredient;
import com.specialcook.model.Inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {

    private final Inventory inventory;

    public InventoryService(Inventory inventory) {
        this.inventory = inventory;
    }

    /**
     * يتحقق مما إذا كانت الكمية الحالية للمكون أقل من الحد الأدنى.
     *
     * @param name اسم المكون
     * @return true إذا كانت الكمية منخفضة
     */
    public boolean isLowStock(String name) {
        Ingredient ingredient = inventory.getIngredient(name);
        return ingredient != null && ingredient.getQuantity() < ingredient.getMinRequired();
    }

    /**
     * يقترح قائمة المكونات التي تحتاج لإعادة التوريد.
     *
     * @return قائمة أسماء المكونات منخفضة المخزون
     */
    public List<String> getLowStockIngredients() {
        return null;
    }

    /**
     * يزيد كمية مكون معين.
     *
     * @param name     اسم المكون
     * @param quantity الكمية المراد إضافتها
     */
    public void restockIngredient(String name, int quantity) {
        Ingredient ingredient = inventory.getIngredient(name);
        if (ingredient != null) {
            ingredient.setQuantity(ingredient.getQuantity() + quantity);
        }
    }

    /**
     * ينقص كمية مكون عند الاستخدام.
     *
     * @param name     اسم المكون
     * @param quantity الكمية المستهلكة
     * @return true إذا تمت العملية بنجاح، false إذا لم يتوفر الكمية الكافية
     */
    public boolean consumeIngredient(String name, int quantity) {
        Ingredient ingredient = inventory.getIngredient(name);
        if (ingredient != null && ingredient.getQuantity() >= quantity) {
            ingredient.setQuantity(ingredient.getQuantity() - quantity);
            return true;
        }
        return false;
    }

    public Ingredient getIngredientByName(String item) {
        return null;
    }

    public void addIngredient(Ingredient ingredient) {
    }
}