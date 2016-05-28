    <!-- Fixed navbar -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">${ application.name }</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">Invoice</a></li>
            <li><a href="#contact">Product</a></li>
            <li><a href="#contact">Customer</a></li>
          </ul>
			<ul class="nav navbar-nav navbar-right">
		        <li class="dropdown">
		          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
		          	${ user != null ? user.login : 'Guest' } <span class="caret"></span>
		          </a>
		          <ul class="dropdown-menu">
		            <li><a href="#">${ user != null ? user.name : 'User Guest' }</a></li>
		            <li><a href="#">Profile</a></li>
		            <li role="separator" class="divider"></li>
		            <li><a href="#">About</a></li>
		            <li><a href="#">Help</a></li>
		            <li role="separator" class="divider"></li>
		            <li><a href="#">Logout</a></li>
		          </ul>
		        </li>
		      </ul>          
        </div><!--/.nav-collapse -->
      </div>
    </nav>