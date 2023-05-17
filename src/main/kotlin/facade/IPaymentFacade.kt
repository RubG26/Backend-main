package facade

interface IPaymentFacade {

    //Define la estructura que la fachada de pago en linea debera de tener
    @Throws(GeneralPaymentError::class)
    fun pay(paymentRequest: PaymentRequest?): PaymentResponse?
}