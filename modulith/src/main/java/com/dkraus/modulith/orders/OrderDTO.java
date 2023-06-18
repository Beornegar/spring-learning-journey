package com.dkraus.modulith.orders;

public record OrderDTO(Long id, String product, Long count, Long customerId) {

}
