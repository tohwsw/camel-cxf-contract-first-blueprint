package org.apache.camel.example.reportincident;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.0.redhat-610379
 * 2014-08-08T15:38:21.862+08:00
 * Generated source version: 2.7.0.redhat-610379
 * 
 */
@WebService(targetNamespace = "http://reportincident.example.camel.apache.org", name = "ReportIncidentEndpoint")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ReportIncidentEndpoint {

    @WebResult(name = "outputReportIncident", targetNamespace = "http://reportincident.example.camel.apache.org", partName = "out")
    @WebMethod(operationName = "ReportIncident", action = "http://reportincident.example.camel.apache.org/ReportIncident")
    public OutputReportIncident reportIncident(
        @WebParam(partName = "in", name = "inputReportIncident", targetNamespace = "http://reportincident.example.camel.apache.org")
        InputReportIncident in
    );
}
