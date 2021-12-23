package tutorials

class TestController {

    // used to make default action instead of index() action
    static defaultAction = "list"

    // by default index() is default loading page
    // action as methods (Recommended)
    def index() {
        def ddos = params.data
        render """
"Printing data directly to the web."
<br/>
<br/>
And ${ddos}
"""
    }

/*
Do not use actions as closure
redirect returning URL = null
*Checkout unit test file

    // action as closures
    def list = {
        def dataFromList = "This data comes from list"
//        redirect(action: "index")   // response.redirectedUrl == null
//        redirect(action: "index", params: [author: "Stephen King"])   // assert response.redirectUrl == null
    }
*/

    def list() {
//        redirect(action: "index")   // response.redirectedUrl == "/test/index"

//        response.redirectedUrl == "/test/index?author=Stephen+King"
//        redirect(action: "index", params: [author: "Stephen King"])

        def dataFromList = "This data comes from list"
        redirect(action: "index", params: [data: dataFromList])
    }
}
