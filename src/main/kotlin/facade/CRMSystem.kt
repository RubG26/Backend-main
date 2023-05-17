package facade

//La clase CRMSystem representa al Sistema CRM y es utilizado para consultar la
//información del cliente.
class CRMSystem {
    fun findCustomer(customerId: Long?): Customer? {
        return OnMemoryDataBase().findCustomerById(customerId!!)
    }
}