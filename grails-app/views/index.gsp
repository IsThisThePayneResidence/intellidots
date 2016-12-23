<%@ page import="ua.edu.hneu.ast.utils.Language" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
    <content tag="nav">
    </content>

    <div class="svg" role="presentation">
        <div class="grails-logo-container">
            <asset:image src="grails-cupsonly-logo-white.svg" class="grails-logo"/>
        </div>
    </div>

    <div id="content" role="main">
        <section class="row colset-2-its">

            %{--<g:select class="dropdown" from="${Language.names()}" name="langSelect" value="python3.5">--}%
            %{--</g:select>--}%
            %{--<g:textArea name="codeOne">--}%
%{--a--}%
            %{--</g:textArea>--}%
            %{--<g:textArea name="codeTwo">--}%
%{--a--}%
            %{--</g:textArea>--}%
            %{--<g:set var="cmp" bean="comparationService"/>--}%
            %{--<g:textField name="percent">Процент схожести: </g:textField>--}%
            %{--<g:actionSubmit name="compare" action="${percent.value = cmp.compare('a', 'a', 'python3.5')}">--}%
                %{--Compare--}%
            %{--</g:actionSubmit>--}%
        </section>
    </div>

</body>
</html>
