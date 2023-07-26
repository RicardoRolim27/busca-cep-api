/**
 * 
 */
/**
 * @author ricardo.oliveira
 *
 */
module buscaCepApi {
	requires java.net.http;
	requires com.google.gson;
	opens br.com.aliare.alura.buscaCepApi.dto to gson;
}