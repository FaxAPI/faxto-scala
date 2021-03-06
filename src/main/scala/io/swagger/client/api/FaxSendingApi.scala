/**
 * Fax.to REST API client for Scala
 * This is Fax.to REST API client for Scala.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: inquiries@fax.to
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.InlineResponse200
import io.swagger.client.model.InlineResponse2001
import io.swagger.client.model.InlineResponse20010
import io.swagger.client.model.InlineResponse20011
import io.swagger.client.model.InlineResponse2002
import io.swagger.client.model.InlineResponse2003
import io.swagger.client.model.InlineResponse2008
import io.swagger.client.model.InlineResponse2009
import io.swagger.client.model.InlineResponse400
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class FaxSendingApi(
  val defBasePath: String = "https://api.fax.to/api/v2",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new FaxSendingApiAsyncHelper(client, config)

  /**
   * This API is for computing the cost of the fax to be sent
   * 
   *
   * @param documentId The id of the document to be sent 
   * @param apiKey  
   * @param faxNumber The fax number of the recipient (optional)
   * @return InlineResponse2001
   */
  def faxDocumentIdCostsGet(documentId: Integer, apiKey: String, faxNumber: Option[String] = None): Option[InlineResponse2001] = {
    val await = Try(Await.result(faxDocumentIdCostsGetAsync(documentId, apiKey, faxNumber), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * This API is for computing the cost of the fax to be sent asynchronously
   * 
   *
   * @param documentId The id of the document to be sent 
   * @param apiKey  
   * @param faxNumber The fax number of the recipient (optional)
   * @return Future(InlineResponse2001)
   */
  def faxDocumentIdCostsGetAsync(documentId: Integer, apiKey: String, faxNumber: Option[String] = None): Future[InlineResponse2001] = {
      helper.faxDocumentIdCostsGet(documentId, apiKey, faxNumber)
  }

  /**
   * This API gets the history of a fax
   * 
   *
   * @param apiKey  
   * @param limit The number of record to return (optional)
   * @param page The page you want to get (optional)
   * @return InlineResponse2003
   */
  def faxHistoryGet(apiKey: String, limit: Option[String] = None, page: Option[String] = None): Option[InlineResponse2003] = {
    val await = Try(Await.result(faxHistoryGetAsync(apiKey, limit, page), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * This API gets the history of a fax asynchronously
   * 
   *
   * @param apiKey  
   * @param limit The number of record to return (optional)
   * @param page The page you want to get (optional)
   * @return Future(InlineResponse2003)
   */
  def faxHistoryGetAsync(apiKey: String, limit: Option[String] = None, page: Option[String] = None): Future[InlineResponse2003] = {
      helper.faxHistoryGet(apiKey, limit, page)
  }

  /**
   * This API gets the status of a fax
   * 
   *
   * @param faxJobId The id of the fax job 
   * @param apiKey  
   * @return InlineResponse2002
   */
  def faxJobIdStatusGet(faxJobId: Integer, apiKey: String): Option[InlineResponse2002] = {
    val await = Try(Await.result(faxJobIdStatusGetAsync(faxJobId, apiKey), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * This API gets the status of a fax asynchronously
   * 
   *
   * @param faxJobId The id of the fax job 
   * @param apiKey  
   * @return Future(InlineResponse2002)
   */
  def faxJobIdStatusGetAsync(faxJobId: Integer, apiKey: String): Future[InlineResponse2002] = {
      helper.faxJobIdStatusGet(faxJobId, apiKey)
  }

  /**
   * This API is for sending a new fax in any fax numbers anywhere in the world
   * 
   *
   * @param faxNumber The fax number of the recipient 
   * @param documentId The id of the document to be sent 
   * @param apiKey  
   * @return InlineResponse200
   */
  def faxPost(faxNumber: , documentId: , apiKey: String): Option[InlineResponse200] = {
    val await = Try(Await.result(faxPostAsync(faxNumber, documentId, apiKey), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * This API is for sending a new fax in any fax numbers anywhere in the world asynchronously
   * 
   *
   * @param faxNumber The fax number of the recipient 
   * @param documentId The id of the document to be sent 
   * @param apiKey  
   * @return Future(InlineResponse200)
   */
  def faxPostAsync(faxNumber: , documentId: , apiKey: String): Future[InlineResponse200] = {
      helper.faxPost(faxNumber, documentId, apiKey)
  }

  /**
   * This API is used for cleaning a document
   * 
   *
   * @param documentId The id of the document 
   * @param apiKey  
   * @return InlineResponse2009
   */
  def fileCleanGet(documentId: Integer, apiKey: String): Option[InlineResponse2009] = {
    val await = Try(Await.result(fileCleanGetAsync(documentId, apiKey), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * This API is used for cleaning a document asynchronously
   * 
   *
   * @param documentId The id of the document 
   * @param apiKey  
   * @return Future(InlineResponse2009)
   */
  def fileCleanGetAsync(documentId: Integer, apiKey: String): Future[InlineResponse2009] = {
      helper.fileCleanGet(documentId, apiKey)
  }

  /**
   * This API generates a preview of a document
   * 
   *
   * @param documentId The id of the document 
   * @param apiKey  
   * @return InlineResponse20010
   */
  def fileGeneratePreviewGet(documentId: Integer, apiKey: String): Option[InlineResponse20010] = {
    val await = Try(Await.result(fileGeneratePreviewGetAsync(documentId, apiKey), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * This API generates a preview of a document asynchronously
   * 
   *
   * @param documentId The id of the document 
   * @param apiKey  
   * @return Future(InlineResponse20010)
   */
  def fileGeneratePreviewGetAsync(documentId: Integer, apiKey: String): Future[InlineResponse20010] = {
      helper.fileGeneratePreviewGet(documentId, apiKey)
  }

  /**
   * This API deletes a document
   * 
   *
   * @param documentId The id of the document 
   * @param apiKey  
   * @return InlineResponse20011
   */
  def filesDocumentIDDelete(documentId: Integer, apiKey: String): Option[InlineResponse20011] = {
    val await = Try(Await.result(filesDocumentIDDeleteAsync(documentId, apiKey), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * This API deletes a document asynchronously
   * 
   *
   * @param documentId The id of the document 
   * @param apiKey  
   * @return Future(InlineResponse20011)
   */
  def filesDocumentIDDeleteAsync(documentId: Integer, apiKey: String): Future[InlineResponse20011] = {
      helper.filesDocumentIDDelete(documentId, apiKey)
  }

  /**
   * This API gets all the files of a certain user
   * 
   *
   * @param apiKey  
   * @param limit The number of record to return (optional)
   * @param page The page you want to get (optional)
   * @return InlineResponse2008
   */
  def filesGet(apiKey: String, limit: Option[String] = None, page: Option[String] = None): Option[InlineResponse2008] = {
    val await = Try(Await.result(filesGetAsync(apiKey, limit, page), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * This API gets all the files of a certain user asynchronously
   * 
   *
   * @param apiKey  
   * @param limit The number of record to return (optional)
   * @param page The page you want to get (optional)
   * @return Future(InlineResponse2008)
   */
  def filesGetAsync(apiKey: String, limit: Option[String] = None, page: Option[String] = None): Future[InlineResponse2008] = {
      helper.filesGet(apiKey, limit, page)
  }

}

class FaxSendingApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def faxDocumentIdCostsGet(documentId: Integer,
    apiKey: String,
    faxNumber: Option[String] = None
    )(implicit reader: ClientResponseReader[InlineResponse2001]): Future[InlineResponse2001] = {
    // create path and map variables
    val path = (addFmt("/fax/{document_id}/costs")
      replaceAll("\\{" + "document_id" + "\\}", documentId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (apiKey == null) throw new Exception("Missing required parameter 'apiKey' when calling FaxSendingApi->faxDocumentIdCostsGet")

    faxNumber match {
      case Some(param) => queryParams += "fax_number" -> param.toString
      case _ => queryParams
    }
    headerParams += "api_key" -> apiKey.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def faxHistoryGet(apiKey: String,
    limit: Option[String] = None,
    page: Option[String] = None
    )(implicit reader: ClientResponseReader[InlineResponse2003]): Future[InlineResponse2003] = {
    // create path and map variables
    val path = (addFmt("/fax-history"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (apiKey == null) throw new Exception("Missing required parameter 'apiKey' when calling FaxSendingApi->faxHistoryGet")

    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }
    page match {
      case Some(param) => queryParams += "page" -> param.toString
      case _ => queryParams
    }
    headerParams += "api_key" -> apiKey.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def faxJobIdStatusGet(faxJobId: Integer,
    apiKey: String)(implicit reader: ClientResponseReader[InlineResponse2002]): Future[InlineResponse2002] = {
    // create path and map variables
    val path = (addFmt("/fax/{fax_job_id}/status")
      replaceAll("\\{" + "fax_job_id" + "\\}", faxJobId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (apiKey == null) throw new Exception("Missing required parameter 'apiKey' when calling FaxSendingApi->faxJobIdStatusGet")

    headerParams += "api_key" -> apiKey.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def faxPost(faxNumber: ,
    documentId: ,
    apiKey: String)(implicit reader: ClientResponseReader[InlineResponse200], writer: RequestWriter[], writer: RequestWriter[]): Future[InlineResponse200] = {
    // create path and map variables
    val path = (addFmt("/fax"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (faxNumber == null) throw new Exception("Missing required parameter 'faxNumber' when calling FaxSendingApi->faxPost")
    if (documentId == null) throw new Exception("Missing required parameter 'documentId' when calling FaxSendingApi->faxPost")
    if (apiKey == null) throw new Exception("Missing required parameter 'apiKey' when calling FaxSendingApi->faxPost")

    headerParams += "api_key" -> apiKey.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(documentId))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def fileCleanGet(documentId: Integer,
    apiKey: String)(implicit reader: ClientResponseReader[InlineResponse2009]): Future[InlineResponse2009] = {
    // create path and map variables
    val path = (addFmt("/file-clean"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (apiKey == null) throw new Exception("Missing required parameter 'apiKey' when calling FaxSendingApi->fileCleanGet")

    headerParams += "document_id" -> documentId.toString
    headerParams += "api_key" -> apiKey.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def fileGeneratePreviewGet(documentId: Integer,
    apiKey: String)(implicit reader: ClientResponseReader[InlineResponse20010]): Future[InlineResponse20010] = {
    // create path and map variables
    val path = (addFmt("/file-generate-preview"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (apiKey == null) throw new Exception("Missing required parameter 'apiKey' when calling FaxSendingApi->fileGeneratePreviewGet")

    headerParams += "document_id" -> documentId.toString
    headerParams += "api_key" -> apiKey.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def filesDocumentIDDelete(documentId: Integer,
    apiKey: String)(implicit reader: ClientResponseReader[InlineResponse20011]): Future[InlineResponse20011] = {
    // create path and map variables
    val path = (addFmt("/files/{document_id}")
      replaceAll("\\{" + "document_id" + "\\}", documentId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (apiKey == null) throw new Exception("Missing required parameter 'apiKey' when calling FaxSendingApi->filesDocumentIDDelete")

    headerParams += "api_key" -> apiKey.toString

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def filesGet(apiKey: String,
    limit: Option[String] = None,
    page: Option[String] = None
    )(implicit reader: ClientResponseReader[InlineResponse2008]): Future[InlineResponse2008] = {
    // create path and map variables
    val path = (addFmt("/files"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (apiKey == null) throw new Exception("Missing required parameter 'apiKey' when calling FaxSendingApi->filesGet")

    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }
    page match {
      case Some(param) => queryParams += "page" -> param.toString
      case _ => queryParams
    }
    headerParams += "api_key" -> apiKey.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
