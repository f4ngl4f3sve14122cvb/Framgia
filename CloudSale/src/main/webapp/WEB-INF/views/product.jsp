<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Dashboard - Home</title>
<meta name="description" content="">
<meta name="author" content="templatemo">
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,700'
	rel='stylesheet' type='text/css'>
<link
	href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/css/templatemo-style.css"
	rel="stylesheet">
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.min.js"></script>
</head>
<body>
	<!-- Left column -->
	<div class="templatemo-flex-row">
		<div class="templatemo-sidebar">
			<header class="templatemo-site-header">
			<div class="square"></div>
			<h1>Visual Admin</h1>
			</header>
			<div class="profile-photo-container">
				<img
					src="${pageContext.request.contextPath}/resources/img/profile-photo.jpg"
					alt="Profile Photo" class="img-responsive">
				<div class="profile-photo-overlay"></div>
			</div>
			<!-- Search box -->
			<form class="templatemo-search-form" role="search">
				<div class="input-group">
					<button type="submit" class="fa fa-search"></button>
					<input type="text" class="form-control" placeholder="Search"
						name="srch-term" id="srch-term">
				</div>
			</form>
			<div class="mobile-menu-icon">
				<i class="fa fa-bars"></i>
			</div>
			<nav class="templatemo-left-nav">
			<ul>
				<li><a href="${pageContext.request.contextPath}/user"
					class="active"><i class="fa fa-home fa-fw"></i>USers Manager</a></li>
				<li><a href="${pageContext.request.contextPath}/product"><i
						class="fa fa-bar-chart fa-fw"></i>Product Manager</a></li>
				<li><a href="${pageContext.request.contextPath}/groupproduct"><i
						class="fa fa-database fa-fw"></i>Group Product Manager</a></li>
				<li><a href="${pageContext.request.contextPath}/shop"><i
						class="fa fa-map-marker fa-fw"></i>Shop Manager</a></li>
				<li><a href="manage-users.html"><i
						class="fa fa-users fa-fw"></i>Order Manager</a></li>
				<li><a href="${pageContext.request.contextPath}/logout"><i
						class="fa fa-eject fa-fw"></i>Sign Out</a></li>
			</ul>
			</nav>
		</div>
		<!-- Main content -->
		<div class="templatemo-content col-1 light-gray-bg">
			<div class="templatemo-top-nav-container">
				<div class="row">
					<nav class="templatemo-top-nav col-lg-12 col-md-12">
					<ul class="text-uppercase">
						<li><a href="" class="active">Manager Users</a></li>
						<li><a href="">Manager Product</a></li>
						<li><a href="">Manager Orders</a></li>
						<li><a href="login.html">Sign in form</a></li>
					</ul>
					</nav>
				</div>
			</div>
			<div class="templatemo-content-container">
			<c:set var = "us" value="${listUser.size()}"></c:set>
			<c:if test="${us == 0}">
				<div class="btn"><a href="${pageContext.request.contextPath}/adduser">Add New User</a></div>
			</c:if>
				<div
					class="panel panel-default templatemo-content-widget white-bg no-padding templatemo-overflow-hidden">
					<i class="fa fa-times"></i>
					<div class="panel-heading templatemo-position-relative">
						<h2 class="text-uppercase">User Table</h2>
					</div>
					<div class="table-responsive">
						<table class="table table-striped table-bordered">
							<thead>
								<tr>
									<td>Identity</td>
									<td>User Name</td>
									<td>Pass Word</td>
									<td>Role</td>
									<td>Status</td>
									<td>Shoper</td>
									<td>Customer</td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
							</thead>
							<tbody>
								<c:forEach var = "item" items="${listUser}">
									<tr>
										<td>${item.identity}</td>
										<td>${item.username}</td>
										<td>${item.password}</td>
										<td>${item.role}</td>
										<td>${item.status}</td>
										<td>${item.shop.name}</td>
										<td>${item.customer.name}</td>
										<td><a href="${pageContext.request.contextPath}/adduser">Add</a></td>
										<td><a href="${pageContext.request.contextPath}/edituser?identity=${item.identity}">Edit</a></td>
										<td><a href="${pageContext.request.contextPath}/deleteuser?identity=${item.identity}">Delete</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>