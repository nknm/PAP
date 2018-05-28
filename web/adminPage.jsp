<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>

        <div class="container">
            <!-- Trigger the modal with a button -->
            <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Add new item</button>

            <!-- Modal -->
            <div class="modal fade" id="myModal" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->


                    <!-- Ask for help here pics <- -->


                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Add new item</h4>
                        </div>
                        <div class="modal-body">
                            <!-- Inside the modal-->

                            <!-- Name -->
                            <div class="form-group">
                                <label for="clname">Name:</label>
                                <input type="text" class="form-control" id="clname">
                            </div>
                            <!-- Price -->
                            <div class="form-group">
                                <label for="clprice">Price:</label>
                                <input type="text" class="form-control" id="clprice">
                            </div>
                            <!-- Color -->
                            <div class="form-group">
                                <label for="clcolor">Color:</label>
                                <input type="text" class="form-control" id="clcolor">
                            </div>
                            <!-- Size + Units (Add units later) -->
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="" id="checkXS" name="XS" onclick="dynInput(this);">
                                <label class="form-check-label" for="checkXS">
                                    XS
                                </label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="" id="checkS" name="S" onclick="dynInput(this);">
                                <label class="form-check-label" for="checkS">
                                    S
                                </label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="" id="checkM" name="M" onclick="dynInput(this);">
                                <label class="form-check-label" for="checkM">
                                    M
                                </label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="" id="checkL" name="L" onclick="dynInput(this);">
                                <label class="form-check-label" for="checkL">
                                    L
                                </label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="" id="checkXL" name="XL" onclick="dynInput(this);">
                                <label class="form-check-label" for="checkXL">
                                    XL
                                </label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="" id="checkXXL" name="XXL" onclick="dynInput(this);">
                                <label class="form-check-label" for="checkXXL">
                                    XXL
                                </label>
                            </div>
                            <p id="insertinputs"></p>
                            <!-- Description -->
                            <div class="form-group">
                                <label for="clDescription">Description</label>
                                <textarea class="form-control" id="clDescription" rows="3"></textarea>
                            </div>
                            <div class="form-group">
                                <label for="cltype">Clothing type</label>
                                <select class="form-control" id="typeSelector">

                                    <!-- Load options from database
                                    <option>1</option>-->

                                </select>
                            </div>
                            <form>
                                <div class="form-group">
                                    <label for="clImage">Images</label>
                                    <input type="file" class="form-control-file" id="exampleFormControlFile1">
                                </div>
                            </form>

                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-primary" data-dismiss="modal">Add</button>
                            <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
            <div>
                <label for="cltype">Add new Clothing type</label>
                <input type="text" class="form-control" id="cltype">
                <button type="submit" class="btn btn-primary">+</button> <br>
                <!-- This is after you add items -->
                <%
                    // String url = "bananas";
                    //String image = "<a href='"+url+"' target='_blank'>";
                    //search image on database
%>
            </div>
        </div>

    </body>
</html>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="js/my.js"></script>