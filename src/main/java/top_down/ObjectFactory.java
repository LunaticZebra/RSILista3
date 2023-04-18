
package top_down;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the top_down package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FishNotFoundEx_QNAME = new QName("http://service/", "FishNotFoundEx");
    private final static QName _AddFish_QNAME = new QName("http://service/", "addFish");
    private final static QName _AddFishResponse_QNAME = new QName("http://service/", "addFishResponse");
    private final static QName _CountFish_QNAME = new QName("http://service/", "countFish");
    private final static QName _CountFishResponse_QNAME = new QName("http://service/", "countFishResponse");
    private final static QName _DeleteFish_QNAME = new QName("http://service/", "deleteFish");
    private final static QName _DeleteFishResponse_QNAME = new QName("http://service/", "deleteFishResponse");
    private final static QName _GetAllFish_QNAME = new QName("http://service/", "getAllFish");
    private final static QName _GetAllFishResponse_QNAME = new QName("http://service/", "getAllFishResponse");
    private final static QName _GetFish_QNAME = new QName("http://service/", "getFish");
    private final static QName _GetFishResponse_QNAME = new QName("http://service/", "getFishResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: top_down
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FishNotFoundEx }
     * 
     */
    public FishNotFoundEx createFishNotFoundEx() {
        return new FishNotFoundEx();
    }

    /**
     * Create an instance of {@link AddFish }
     * 
     */
    public AddFish createAddFish() {
        return new AddFish();
    }

    /**
     * Create an instance of {@link AddFishResponse }
     * 
     */
    public AddFishResponse createAddFishResponse() {
        return new AddFishResponse();
    }

    /**
     * Create an instance of {@link CountFish }
     * 
     */
    public CountFish createCountFish() {
        return new CountFish();
    }

    /**
     * Create an instance of {@link CountFishResponse }
     * 
     */
    public CountFishResponse createCountFishResponse() {
        return new CountFishResponse();
    }

    /**
     * Create an instance of {@link DeleteFish }
     * 
     */
    public DeleteFish createDeleteFish() {
        return new DeleteFish();
    }

    /**
     * Create an instance of {@link DeleteFishResponse }
     * 
     */
    public DeleteFishResponse createDeleteFishResponse() {
        return new DeleteFishResponse();
    }

    /**
     * Create an instance of {@link GetAllFish }
     * 
     */
    public GetAllFish createGetAllFish() {
        return new GetAllFish();
    }

    /**
     * Create an instance of {@link GetAllFishResponse }
     * 
     */
    public GetAllFishResponse createGetAllFishResponse() {
        return new GetAllFishResponse();
    }

    /**
     * Create an instance of {@link GetFish }
     * 
     */
    public GetFish createGetFish() {
        return new GetFish();
    }

    /**
     * Create an instance of {@link GetFishResponse }
     * 
     */
    public GetFishResponse createGetFishResponse() {
        return new GetFishResponse();
    }

    /**
     * Create an instance of {@link Fish }
     * 
     */
    public Fish createFish() {
        return new Fish();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FishNotFoundEx }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FishNotFoundEx }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "FishNotFoundEx")
    public JAXBElement<FishNotFoundEx> createFishNotFoundEx(FishNotFoundEx value) {
        return new JAXBElement<FishNotFoundEx>(_FishNotFoundEx_QNAME, FishNotFoundEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFish }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddFish }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "addFish")
    public JAXBElement<AddFish> createAddFish(AddFish value) {
        return new JAXBElement<AddFish>(_AddFish_QNAME, AddFish.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFishResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddFishResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "addFishResponse")
    public JAXBElement<AddFishResponse> createAddFishResponse(AddFishResponse value) {
        return new JAXBElement<AddFishResponse>(_AddFishResponse_QNAME, AddFishResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountFish }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountFish }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "countFish")
    public JAXBElement<CountFish> createCountFish(CountFish value) {
        return new JAXBElement<CountFish>(_CountFish_QNAME, CountFish.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountFishResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountFishResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "countFishResponse")
    public JAXBElement<CountFishResponse> createCountFishResponse(CountFishResponse value) {
        return new JAXBElement<CountFishResponse>(_CountFishResponse_QNAME, CountFishResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFish }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteFish }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteFish")
    public JAXBElement<DeleteFish> createDeleteFish(DeleteFish value) {
        return new JAXBElement<DeleteFish>(_DeleteFish_QNAME, DeleteFish.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFishResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteFishResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteFishResponse")
    public JAXBElement<DeleteFishResponse> createDeleteFishResponse(DeleteFishResponse value) {
        return new JAXBElement<DeleteFishResponse>(_DeleteFishResponse_QNAME, DeleteFishResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFish }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllFish }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllFish")
    public JAXBElement<GetAllFish> createGetAllFish(GetAllFish value) {
        return new JAXBElement<GetAllFish>(_GetAllFish_QNAME, GetAllFish.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFishResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllFishResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllFishResponse")
    public JAXBElement<GetAllFishResponse> createGetAllFishResponse(GetAllFishResponse value) {
        return new JAXBElement<GetAllFishResponse>(_GetAllFishResponse_QNAME, GetAllFishResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFish }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFish }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getFish")
    public JAXBElement<GetFish> createGetFish(GetFish value) {
        return new JAXBElement<GetFish>(_GetFish_QNAME, GetFish.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFishResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFishResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getFishResponse")
    public JAXBElement<GetFishResponse> createGetFishResponse(GetFishResponse value) {
        return new JAXBElement<GetFishResponse>(_GetFishResponse_QNAME, GetFishResponse.class, null, value);
    }

}
