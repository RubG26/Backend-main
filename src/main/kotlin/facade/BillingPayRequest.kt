package facade

//Clase que representa el request del sistema de facturación, el cual recibe el ID
//del cliente y el monto a aplicar.
class BillingPayRequest {
    private var customerId: Long? = null
    private var amount = 0.0

    constructor (customerId: Long, amount: Double) {
        this.customerId = customerId
        this.amount = amount
    }

    fun getCustomerId(): Long? {
        return customerId
    }

    fun setCustomerId(customerId: Long?) {
        this.customerId = customerId
    }

    fun getAmount(): Double {
        return amount
    }

    fun setAmount(amount: Double) {
        this.amount = amount
    }
}