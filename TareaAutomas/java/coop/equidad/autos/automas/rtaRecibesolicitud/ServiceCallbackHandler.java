
/**
 * ServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */

    package coop.equidad.autos.automas.rtaRecibesolicitud;

    /**
     *  ServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for recibeSolicitud method
            * override this method for handling normal response from recibeSolicitud operation
            */
           public void receiveResultrecibeSolicitud(
                    coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub.RecibeSolicitudResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from recibeSolicitud operation
           */
            public void receiveErrorrecibeSolicitud(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consultarInforme method
            * override this method for handling normal response from consultarInforme operation
            */
           public void receiveResultconsultarInforme(
                    coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub.ConsultarInformeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consultarInforme operation
           */
            public void receiveErrorconsultarInforme(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consultarAccesorios method
            * override this method for handling normal response from consultarAccesorios operation
            */
           public void receiveResultconsultarAccesorios(
                    coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub.ConsultarAccesoriosResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consultarAccesorios operation
           */
            public void receiveErrorconsultarAccesorios(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consultarCiudadDomicilio method
            * override this method for handling normal response from consultarCiudadDomicilio operation
            */
           public void receiveResultconsultarCiudadDomicilio(
                    coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub.ConsultarCiudadDomicilioResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consultarCiudadDomicilio operation
           */
            public void receiveErrorconsultarCiudadDomicilio(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consultarRtaInspeccion method
            * override this method for handling normal response from consultarRtaInspeccion operation
            */
           public void receiveResultconsultarRtaInspeccion(
                    coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub.ConsultarRtaInspeccionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consultarRtaInspeccion operation
           */
            public void receiveErrorconsultarRtaInspeccion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consultarImagenesTP method
            * override this method for handling normal response from consultarImagenesTP operation
            */
           public void receiveResultconsultarImagenesTP(
                    coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub.ConsultarImagenesTPResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consultarImagenesTP operation
           */
            public void receiveErrorconsultarImagenesTP(java.lang.Exception e) {
            }
                


    }
    