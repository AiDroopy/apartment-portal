package hu.odin;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@OpenAPIDefinition(info = @Info(
    title="Apartment API",
    version = "1.0.1",
    contact = @Contact(
        name = "Odin Ai & Vision",
        url = "http://localhost:8080/contact",
        email = "techsupport@example.com"),
    license = @License(
        name = "Apache 2.0",
        url = "https://www.apache.org/licenses/LICENSE-2.0.html"))
        )
@ApplicationPath("/api/v1")
public class ApartmentApi extends Application{

}
