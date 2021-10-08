<#include '../layout.ftlh'>

<#macro base>
    <@layout>

        <div id="planning" class="container bg-warning bg-opacity-50 rounded mt-3 px-5 py-3">
            <#nested >
            <h1 class="text-white">Planning</h1>
            <table class="table table-striped bg-white table-bordered">
                <thead>
                <tr>
                    <th scope="col">Date</th>
                    <th scope="col">Nom du foodtruck</th>
                    <th scope="col">Site Web</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <td>Jacob</td>
                    <td>Thornton</td>
                    <td>@fat</td>
                </tr>
                <tr>
                    <td>Laetitia</td>
                    <td>Larry the Bird</td>
                    <td>@twitter</td>
                </tr>
                </tbody>
            </table>
        </div>

    </@layout>
</#macro>
