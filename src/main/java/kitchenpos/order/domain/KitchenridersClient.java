package kitchenpos.order.domain;

import java.math.BigDecimal;
import java.util.UUID;

public interface KitchenridersClient {
    void requestDelivery(UUID orderId, BigDecimal amount, String deliveryAddress);
}
