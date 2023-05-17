package facade

//Clase de exception que sera lanzada cuando se presente algun error en el servicio de pago
class GeneralPaymentError (message: String) : Exception(message)